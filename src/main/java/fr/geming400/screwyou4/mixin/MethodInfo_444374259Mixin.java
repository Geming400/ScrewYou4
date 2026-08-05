package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.api.MethodInfo.class)
public class MethodInfo_444374259Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1829886517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1829886517L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__691085717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-691085717L))
            info.setReturnValue(" \u37F1-Ey\u71BE&Rz+`]7P6P,S5Xc{\u02BBpXB.F=F`+{+AT|D}+,uD\u8162H0.@+6f\u2212 c\u1423gzQ6Qrai\u1B73]>r3h*\u4C25\u6FD4J\uD1F8^\u2BBEWV3c2");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_482637000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(482637000L))
            info.setReturnValue(1441251786);
    }

    @Inject(at = @At("HEAD"), method = "result()Ljava/util/Optional;", cancellable = true)
    private void result_689835680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(689835680L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "params()Ljava/util/Optional;", cancellable = true)
    private void params_689835680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(689835680L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description__691086213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-691086213L))
            info.setReturnValue("9\uACF2$9=\u0BF2&k\u8725o#uGbOq-\u600E0.\uB770+J@0Xa|\u013F\u8254n^N\u4B12(Rlt690Y\"P'!l]:qnfKQjFt;is<\uB92F$pt!\uAFA4:qk0cv\u08A6T+V,=\u144Fn/q");
    }

    @Inject(at = @At("HEAD"), method = "named(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/server/jsonrpc/api/MethodInfo$Named;", cancellable = true)
    private void named_633036251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(633036251L))
            info.setReturnValue(null);
    }


}
