package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.WorldDimensions.Complete.class)
public class Complete107088988Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1492601247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1492601247L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1028370987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1028370987L))
            info.setReturnValue("^Y*vAJ_kG-:+8:tk\u8D7D3\u8388\u2350<U{oHr\u76D7M1@");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_145351730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(145351730L))
            info.setReturnValue(-872516253);
    }

    @Inject(at = @At("HEAD"), method = "dimensions()Lnet/minecraft/core/Registry;", cancellable = true)
    private void dimensions__406766489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-406766489L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lifecycle()Lcom/mojang/serialization/Lifecycle;", cancellable = true)
    private void lifecycle__924299442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-924299442L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dimensionsRegistryAccess()Lnet/minecraft/core/RegistryAccess$Frozen;", cancellable = true)
    private void dimensionsRegistryAccess__141661277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-141661277L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "specialWorldProperty()Lnet/minecraft/world/level/storage/PrimaryLevelData$SpecialWorldProperty;", cancellable = true)
    private void specialWorldProperty_1389077482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1389077482L))
            info.setReturnValue(net.minecraft.world.level.storage.PrimaryLevelData.SpecialWorldProperty.FLAT);
    }


}
