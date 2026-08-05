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
            info.setReturnValue("{H3!ꃡGxH+๔s!桬)㇊>A`TVu⦅1利hFoCcc饘zM嵥nl+࿉S?Y嫗N᷽ꁪ⏢辭辷L&cY[/LmX*颾tb& H5恴{-ohސ!ᅰ.B)]r#uu,\"㵎圣ꎭ06+");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1190915532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1190915532L))
            info.setReturnValue(-1748431970);
    }

    @Inject(at = @At("HEAD"), method = "lootTable()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void lootTable_1961144103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1961144103L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deactivationRange()D", cancellable = true)
    private void deactivationRange_1190910231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1190910231L))
            info.setReturnValue(5.920028006440881E8D);
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

    @Inject(at = @At("HEAD"), method = "activationRange()D", cancellable = true)
    private void activationRange_1190910231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1190910231L))
            info.setReturnValue(5.920028006440881E8D);
    }

    @Inject(at = @At("HEAD"), method = "keyItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void keyItem_1676071450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1676071450L))
            info.setReturnValue(null);
    }


}
