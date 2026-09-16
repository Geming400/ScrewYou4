package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.EnchantmentMenu.class)
public class EnchantmentMenu1871825352Mixin {
        @Inject(at = @At("HEAD"), method = "removed(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void removed__1757948266(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1757948266L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEnchantmentSeed()I", cancellable = true)
    private void getEnchantmentSeed__233149220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-233149220L))
            info.setReturnValue(-265206272);
    }

    @Inject(at = @At("HEAD"), method = "getGoldCount()I", cancellable = true)
    private void getGoldCount_1198707061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1198707061L))
            info.setReturnValue(683962173);
    }

    @Inject(at = @At("HEAD"), method = "clickMenuButton(Lnet/minecraft/world/entity/player/Player;I)Z", cancellable = true)
    private void clickMenuButton__1658950666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1658950666L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "slotsChanged(Lnet/minecraft/world/Container;)V", cancellable = true)
    private void slotsChanged_130219169(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(130219169L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "quickMoveStack(Lnet/minecraft/world/entity/player/Player;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void quickMoveStack_548996548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(548996548L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__162085818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-162085818L))
            info.setReturnValue(false);
    }


}
