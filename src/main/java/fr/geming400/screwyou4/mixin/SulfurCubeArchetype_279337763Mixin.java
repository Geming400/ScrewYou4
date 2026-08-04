package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.SulfurCubeArchetype.class)
public class SulfurCubeArchetype_279337763Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1664850021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1664850021L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__856122213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-856122213L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_317600504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(317600504L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "items()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void items_1899290806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1899290806L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contactDamage()Ljava/util/Optional;", cancellable = true)
    private void contactDamage_524799184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(524799184L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "soundSettings()Lnet/minecraft/world/entity/SulfurCubeArchetype$SoundSettings;", cancellable = true)
    private void soundSettings__429192830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-429192830L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "knockbackModifiers()Lnet/minecraft/world/entity/SulfurCubeArchetype$KnockbackModifiers;", cancellable = true)
    private void knockbackModifiers__83192287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-83192287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "explosion()Ljava/util/Optional;", cancellable = true)
    private void explosion_524799184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(524799184L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attributeModifiers()Ljava/util/List;", cancellable = true)
    private void attributeModifiers_1905674578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1905674578L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buoyant()Z", cancellable = true)
    private void buoyant_317616345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(317616345L))
            info.setReturnValue(null);
    }


}
