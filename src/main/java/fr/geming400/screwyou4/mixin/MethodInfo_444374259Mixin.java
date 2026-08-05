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
            info.setReturnValue(" 㟱-Ey熾&Rz+`]7P6P,S5Xc{ʻpXB.F=F`+{+AT|D}+,uD腢H0.@+6f− cᐣgzQ6Qrai᭳]>r3h*䰥濔J퇸^⮾WV3c2");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_482637000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(482637000L))
            info.setReturnValue(1495857486);
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
            info.setReturnValue("9곲$9=௲&k蜥o#uGbOq-怎0.띰+J@0Xa|Ŀ艔n^N䬒(Rlt690Y\"P'!l]:qnfKQjFt;is<뤯$pt!꾤:qk0cvࢦT+V,=ᑏn/q");
    }

    @Inject(at = @At("HEAD"), method = "named(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/server/jsonrpc/api/MethodInfo$Named;", cancellable = true)
    private void named_633036251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(633036251L))
            info.setReturnValue(null);
    }


}
