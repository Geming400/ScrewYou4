package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.vault.VaultConfig.class)
public class VaultConfig1152652790Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_244026522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(244026522L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1923076315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1923076315L))
            info.setReturnValue("=k%t\u3B5Bcw^5\uAC2FKn\u68F6u+b:_@*5r]FXA8,\u3B69`V\u49EF{A|}.:<^.D\uAB38@|y[\u76C8iFc\u163EnOj5\u921F0Jg4'4t");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1710004881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1710004881L))
            info.setReturnValue(-1587594529);
    }

    @Inject(at = @At("HEAD"), method = "lootTable()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void lootTable_847462369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(847462369L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deactivationRange()D", cancellable = true)
    private void deactivationRange__945350223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-945350223L))
            info.setReturnValue(9.255268009119217E8D);
    }

    @Inject(at = @At("HEAD"), method = "playerDetector()Lnet/minecraft/world/level/block/entity/trialspawner/PlayerDetector;", cancellable = true)
    private void playerDetector__1551618635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1551618635L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overrideLootTableToDisplay()Ljava/util/Optional;", cancellable = true)
    private void overrideLootTableToDisplay_2027698161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2027698161L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entitySelector()Lnet/minecraft/world/level/block/entity/trialspawner/PlayerDetector$EntitySelector;", cancellable = true)
    private void entitySelector__921713656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-921713656L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "activationRange()D", cancellable = true)
    private void activationRange_1125210032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1125210032L))
            info.setReturnValue(9.255268001787844E8D);
    }

    @Inject(at = @At("HEAD"), method = "keyItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void keyItem_38542892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(38542892L))
            info.setReturnValue(null);
    }


}
