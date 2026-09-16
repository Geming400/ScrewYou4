package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.WorldDimensions.Complete.class)
public class Complete107088988Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__801537280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-801537280L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_877512513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(877512513L))
            info.setReturnValue("D? ba6wyk3d");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_664441079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(664441079L))
            info.setReturnValue(1795545990);
    }

    @Inject(at = @At("HEAD"), method = "dimensions()Lnet/minecraft/core/Registry;", cancellable = true)
    private void dimensions__251467206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-251467206L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lifecycle()Lcom/mojang/serialization/Lifecycle;", cancellable = true)
    private void lifecycle_1979843768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1979843768L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dimensionsRegistryAccess()Lnet/minecraft/core/RegistryAccess$Frozen;", cancellable = true)
    private void dimensionsRegistryAccess__114336687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-114336687L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "specialWorldProperty()Lnet/minecraft/world/level/storage/PrimaryLevelData$SpecialWorldProperty;", cancellable = true)
    private void specialWorldProperty_1792578396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1792578396L))
            info.setReturnValue(net.minecraft.world.level.storage.PrimaryLevelData.SpecialWorldProperty.FLAT);
    }


}
