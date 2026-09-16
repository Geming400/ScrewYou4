package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.ClientAsset.ResourceTexture.class)
public class ResourceTexture718755352Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__189870916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-189870916L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1489178877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1489178877L))
            info.setReturnValue("Jo>:\u239C]Yz@g|YV`[\u3A5Dkp|@E\uFF05exa5816^F+;M4");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1276107443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1276107443L))
            info.setReturnValue(-1215367004);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__1874022534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1874022534L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "texturePath()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void texturePath_278487359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(278487359L))
            info.setReturnValue(null);
    }


}
