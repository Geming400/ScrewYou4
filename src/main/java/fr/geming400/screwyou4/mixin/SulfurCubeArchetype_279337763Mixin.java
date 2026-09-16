package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.SulfurCubeArchetype.class)
public class SulfurCubeArchetype_279337763Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__629288506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-629288506L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1049761287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1049761287L))
            info.setReturnValue(";Dxn5]STtZ(Xr ?*4");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_836689853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(836689853L))
            info.setReturnValue(-1009944485);
    }

    @Inject(at = @At("HEAD"), method = "items()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void items_1871239286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1871239286L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "explosion()Ljava/util/Optional;", cancellable = true)
    private void explosion_1048137957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1048137957L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attributeModifiers()Ljava/util/List;", cancellable = true)
    private void attributeModifiers__930208110(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-930208110L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buoyant()Z", cancellable = true)
    private void buoyant__287861809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-287861809L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "contactDamage()Ljava/util/Optional;", cancellable = true)
    private void contactDamage__765824129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-765824129L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "soundSettings()Lnet/minecraft/world/entity/SulfurCubeArchetype$SoundSettings;", cancellable = true)
    private void soundSettings__1427007660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1427007660L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "knockbackModifiers()Lnet/minecraft/world/entity/SulfurCubeArchetype$KnockbackModifiers;", cancellable = true)
    private void knockbackModifiers_1550773248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1550773248L))
            info.setReturnValue(null);
    }


}
