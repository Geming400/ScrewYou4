package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.vault.VaultConfig.class)
public class VaultConfig1152652790Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1756802247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1756802247L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_17192815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(17192815L))
            info.setReturnValue("{H3!\uA0E1GxH+\u0E54s!\u686C)\u31CA>A`TVu\u29851\u5229hFoCcc\u9958zM\u5D65nl+\u0FC9S?Y\u5AD7N\u1DFD\uA06A\u23E2\u8FAD\u8FB7L&cY[/LmX*\u98BEtb& H5\u6074{-oh\u0790!\u1170.B)]r#uu,\"\u3D4E\u5723\uA3AD06+");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1190915532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1190915532L))
            info.setReturnValue(-1892009770);
    }

    @Inject(at = @At("HEAD"), method = "lootTable()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void lootTable_1961144103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1961144103L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "activationRange()D", cancellable = true)
    private void activationRange_1190910231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1190910231L))
            info.setReturnValue(4.484250006440881E8D);
    }

    @Inject(at = @At("HEAD"), method = "deactivationRange()D", cancellable = true)
    private void deactivationRange_1190910231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1190910231L))
            info.setReturnValue(4.484250006440881E8D);
    }

    @Inject(at = @At("HEAD"), method = "overrideLootTableToDisplay()Ljava/util/Optional;", cancellable = true)
    private void overrideLootTableToDisplay_1398114212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1398114212L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerDetector()Lnet/minecraft/world/level/block/entity/trialspawner/PlayerDetector;", cancellable = true)
    private void playerDetector_1071707886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1071707886L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entitySelector()Lnet/minecraft/world/level/block/entity/trialspawner/PlayerDetector$EntitySelector;", cancellable = true)
    private void entitySelector__1722008790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1722008790L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "keyItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void keyItem_1676071450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1676071450L))
            info.setReturnValue(null);
    }


}
