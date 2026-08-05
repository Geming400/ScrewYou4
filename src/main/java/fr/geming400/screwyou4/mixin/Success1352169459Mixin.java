package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ChunkResult.Success.class)
public class Success1352169459Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value__1083605618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1083605618L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1557285578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1557285578L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_216709484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(216709484L))
            info.setReturnValue("w_d a\u2F1EWy]\uA08DZfzGO6x\uCB30qf qyV}/H181Z!bK8+{{SL#V\u868BX;\u95E4]erEnb<!>h(#\u6CC5[m\u5993*|s!C?4U\uA0F9i\uFB75^,Uz(");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1390432201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1390432201L))
            info.setReturnValue(1699864489);
    }

    @Inject(at = @At("HEAD"), method = "map(Ljava/util/function/Function;)Lnet/minecraft/server/level/ChunkResult;", cancellable = true)
    private void map__1310722382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1310722382L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "orElse(Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void orElse_1364247410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1364247410L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "orElseThrow(Ljava/util/function/Supplier;)Ljava/lang/Object;", cancellable = true)
    private void orElseThrow_1831248506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1831248506L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "isSuccess()Z", cancellable = true)
    private void isSuccess_1390448042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1390448042L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "ifSuccess(Ljava/util/function/Consumer;)Lnet/minecraft/server/level/ChunkResult;", cancellable = true)
    private void ifSuccess__952643120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-952643120L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getError()Ljava/lang/String;", cancellable = true)
    private void getError_216708988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(216708988L))
            info.setReturnValue("\u79AB{m\uAA66qLA'F\uB320\u1A53g'`\u9DEBm(Dm|Mb'\uD7F1']?\uB21EeW)Fd,`:]}\u9F249vNd]J;!p[d\u8D92y&\uCB0C'\u8F93K4lI\u5AEDx!jmy|/`3plYT\u4EFFR\uCF02!\u425E<\u9296$|2");
    }


}
