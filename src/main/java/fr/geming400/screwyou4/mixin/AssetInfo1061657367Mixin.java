package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.wolf.WolfVariant.AssetInfo.class)
public class AssetInfo1061657367Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1847797670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1847797670L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__73802608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-73802608L))
            info.setReturnValue(".}(1u|xaQS yVO}\uC53F|53e\u772FAc]}|QQ\u3251U 3#/zFT,p<@\u828B\u5906_");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1099920109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1099920109L))
            info.setReturnValue(1509219573);
    }

    @Inject(at = @At("HEAD"), method = "angry()Lnet/minecraft/core/ClientAsset$ResourceTexture;", cancellable = true)
    private void angry__190523853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-190523853L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tame()Lnet/minecraft/core/ClientAsset$ResourceTexture;", cancellable = true)
    private void tame__190523853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-190523853L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wild()Lnet/minecraft/core/ClientAsset$ResourceTexture;", cancellable = true)
    private void wild__190523853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-190523853L))
            info.setReturnValue(null);
    }


}
