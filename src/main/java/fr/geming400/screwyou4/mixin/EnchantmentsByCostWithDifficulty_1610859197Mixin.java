package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.providers.EnchantmentsByCostWithDifficulty.class)
public class EnchantmentsByCostWithDifficulty_1610859197Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_702232928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(702232928L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1913684575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1913684575L))
            info.setReturnValue("\u394C\u1D97:=(9l=Nba]'Ya^0u=#< haM@PiPG7Lr/%1G$zfhT.$Bng%i");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2126756009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2126756009L))
            info.setReturnValue(2140960442);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1617662846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1617662846L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantments()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void enchantments__491725972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-491725972L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchant(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/enchantment/ItemEnchantments$Mutable;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/DifficultyInstance;)V", cancellable = true)
    private void enchant__1631085370(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1631085370L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "minCost()I", cancellable = true)
    private void minCost_339031747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(339031747L))
            info.setReturnValue(1468375350);
    }

    @Inject(at = @At("HEAD"), method = "maxCostSpan()I", cancellable = true)
    private void maxCostSpan__75828409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-75828409L))
            info.setReturnValue(460591926);
    }


}
