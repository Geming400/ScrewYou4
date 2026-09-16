package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.wolf.WolfVariant.AssetInfo.class)
public class AssetInfo1061657367Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_153031099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(153031099L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1832080892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1832080892L))
            info.setReturnValue(",f6:I0hrJ*n!\u87C3&gh6\u0345}wkUcA\u33C73*>S\u46D1'j=%N");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1619009458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1619009458L))
            info.setReturnValue(1171957228);
    }

    @Inject(at = @At("HEAD"), method = "angry()Lnet/minecraft/core/ClientAsset$ResourceTexture;", cancellable = true)
    private void angry__1191284396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1191284396L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wild()Lnet/minecraft/core/ClientAsset$ResourceTexture;", cancellable = true)
    private void wild__1492970243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1492970243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tame()Lnet/minecraft/core/ClientAsset$ResourceTexture;", cancellable = true)
    private void tame_1286776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1286776L))
            info.setReturnValue(null);
    }


}
