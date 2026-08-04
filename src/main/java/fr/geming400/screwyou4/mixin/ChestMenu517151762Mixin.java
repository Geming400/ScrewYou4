package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.ChestMenu.class)
public class ChestMenu517151762Mixin {
        @Inject(at = @At("HEAD"), method = "removed(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void removed_1457753408(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1457753408L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRowCount()I", cancellable = true)
    private void getRowCount_555414008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(555414008L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "quickMoveStack(Lnet/minecraft/world/entity/player/Player;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void quickMoveStack_1390847512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1390847512L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getContainer()Lnet/minecraft/world/Container;", cancellable = true)
    private void getContainer_1946820518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1946820518L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid_1457757252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1457757252L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "threeRows(ILnet/minecraft/world/entity/player/Inventory;)Lnet/minecraft/world/inventory/ChestMenu;", cancellable = true)
    private static void threeRows__399994201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-399994201L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "threeRows(ILnet/minecraft/world/entity/player/Inventory;Lnet/minecraft/world/Container;)Lnet/minecraft/world/inventory/ChestMenu;", cancellable = true)
    private static void threeRows_602668996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(602668996L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fiveRows(ILnet/minecraft/world/entity/player/Inventory;)Lnet/minecraft/world/inventory/ChestMenu;", cancellable = true)
    private static void fiveRows__399994201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-399994201L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "oneRow(ILnet/minecraft/world/entity/player/Inventory;)Lnet/minecraft/world/inventory/ChestMenu;", cancellable = true)
    private static void oneRow__399994201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-399994201L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fourRows(ILnet/minecraft/world/entity/player/Inventory;)Lnet/minecraft/world/inventory/ChestMenu;", cancellable = true)
    private static void fourRows__399994201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-399994201L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "twoRows(ILnet/minecraft/world/entity/player/Inventory;)Lnet/minecraft/world/inventory/ChestMenu;", cancellable = true)
    private static void twoRows__399994201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-399994201L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sixRows(ILnet/minecraft/world/entity/player/Inventory;Lnet/minecraft/world/Container;)Lnet/minecraft/world/inventory/ChestMenu;", cancellable = true)
    private static void sixRows_602668996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(602668996L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sixRows(ILnet/minecraft/world/entity/player/Inventory;)Lnet/minecraft/world/inventory/ChestMenu;", cancellable = true)
    private static void sixRows__399994201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-399994201L))
            info.setReturnValue(null);
    }


}
