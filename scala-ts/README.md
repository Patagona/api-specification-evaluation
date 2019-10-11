# [scala-ts](https://github.com/scala-ts/scala-ts/blob/master/docs/index.md)
```shell script
TERM=xterm-color sbt generateTypeScript de.patagona.Job
```

## Converts
- Scala :arrow_right: TypeScript

## Example
```typescript
export interface IJob {
	abc: string;
	uuid: (string | null);
	schedule: string;
	retries: (number | null);
	jobType: string;
	component: string;
	action: string;
}
```