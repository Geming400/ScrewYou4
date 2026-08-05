package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ProblemReporter.MapEntryPathElement.class)
public class MapEntryPathElement_259889209Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name__875571263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-875571263L))
            info.setReturnValue("dp\u6A75CLngo_X/%?bQ\u280D\u4F1CsTA\u8C50Wh.\uCA2Ctkw,\u0431smPaed%k9y/s{\u0757W,i%\u373DMm\u4C48#\uBCA1W\u7050z\u5DD0");
    }

    @Inject(at = @At("HEAD"), method = "get()Ljava/lang/String;", cancellable = true)
    private void get__875571263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-875571263L))
            info.setReturnValue("dp\u6A75CLngo_X/%?bQ\u280D\u4F1CsTA\u8C50Wh.\uCA2Ctkw,\u0431smPaed%k9y/s{\u0757W,i%\u373DMm\u4C48#\uBCA1W\u7050z\u5DD0");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1645401467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1645401467L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__875570767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-875570767L))
            info.setReturnValue("1L_`w<+O8b7t\u4DE6'<nX\uA41D\uFC62U8B#!bdnFysM?Ba.f\u7D1Db.FYI\u6F0BXV,\"ARv>7{\u9527N$#+fV7");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_298151950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(298151950L))
            info.setReturnValue(1558968401);
    }

    @Inject(at = @At("HEAD"), method = "key()Ljava/lang/String;", cancellable = true)
    private void key__875571263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-875571263L))
            info.setReturnValue("dp\u6A75CLngo_X/%?bQ\u280D\u4F1CsTA\u8C50Wh.\uCA2Ctkw,\u0431smPaed%k9y/s{\u0757W,i%\u373DMm\u4C48#\uBCA1W\u7050z\u5DD0");
    }


}
