package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.ToolMaterial.class)
public class ToolMaterial2127786075Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1219159807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1219159807L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1396757696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1396757696L))
            info.setReturnValue("3\u74A74!U)Uc$a^X,Q\u58FBlR\u5D2E\u2A9Bf%{3YK]\u2271@1DA)\uC916.");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1609829130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1609829130L))
            info.setReturnValue(-315547754);
    }

    @Inject(at = @At("HEAD"), method = "speed()F", cancellable = true)
    private void speed__1587917033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1587917033L))
            info.setReturnValue(6.264534E8F);
    }

    @Inject(at = @At("HEAD"), method = "durability()I", cancellable = true)
    private void durability_378128344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(378128344L))
            info.setReturnValue(1926702027);
    }

    @Inject(at = @At("HEAD"), method = "applySwordProperties(Lnet/minecraft/world/item/Item$Properties;FF)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void applySwordProperties_184259228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(184259228L))
            info.setReturnValue(new net.minecraft.world.item.Item.Properties());
    }

    @Inject(at = @At("HEAD"), method = "applyToolProperties(Lnet/minecraft/world/item/Item$Properties;Lnet/minecraft/tags/TagKey;FFF)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void applyToolProperties_1348319757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1348319757L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attackDamageBonus()F", cancellable = true)
    private void attackDamageBonus__18734730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-18734730L))
            info.setReturnValue(6.264534E8F);
    }

    @Inject(at = @At("HEAD"), method = "repairItems()Lnet/minecraft/tags/TagKey;", cancellable = true)
    private void repairItems_167439461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(167439461L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantmentValue()I", cancellable = true)
    private void enchantmentValue__1881242617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1881242617L))
            info.setReturnValue(2142988335);
    }

    @Inject(at = @At("HEAD"), method = "incorrectBlocksForDrops()Lnet/minecraft/tags/TagKey;", cancellable = true)
    private void incorrectBlocksForDrops_1646546802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1646546802L))
            info.setReturnValue(null);
    }


}
