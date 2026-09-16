package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.ChestMenu.class)
public class ChestMenu517151762Mixin {
        @Inject(at = @At("HEAD"), method = "removed(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void removed_1182345440(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1182345440L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getContainer()Lnet/minecraft/world/Container;", cancellable = true)
    private void getContainer_287045115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(287045115L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__1516759408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1516759408L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "threeRows(ILnet/minecraft/world/entity/player/Inventory;)Lnet/minecraft/world/inventory/ChestMenu;", cancellable = true)
    private static void threeRows_2029193136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2029193136L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "threeRows(ILnet/minecraft/world/entity/player/Inventory;Lnet/minecraft/world/Container;)Lnet/minecraft/world/inventory/ChestMenu;", cancellable = true)
    private static void threeRows__792385125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-792385125L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "quickMoveStack(Lnet/minecraft/world/entity/player/Player;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void quickMoveStack__805677042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-805677042L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRowCount()I", cancellable = true)
    private void getRowCount__724091891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-724091891L))
            info.setReturnValue(1984111910);
    }

    @Inject(at = @At("HEAD"), method = "oneRow(ILnet/minecraft/world/entity/player/Inventory;)Lnet/minecraft/world/inventory/ChestMenu;", cancellable = true)
    private static void oneRow__1344428909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1344428909L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fourRows(ILnet/minecraft/world/entity/player/Inventory;)Lnet/minecraft/world/inventory/ChestMenu;", cancellable = true)
    private static void fourRows__1472991448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1472991448L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fiveRows(ILnet/minecraft/world/entity/player/Inventory;)Lnet/minecraft/world/inventory/ChestMenu;", cancellable = true)
    private static void fiveRows__969395172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-969395172L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sixRows(ILnet/minecraft/world/entity/player/Inventory;Lnet/minecraft/world/Container;)Lnet/minecraft/world/inventory/ChestMenu;", cancellable = true)
    private static void sixRows_667943391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(667943391L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sixRows(ILnet/minecraft/world/entity/player/Inventory;)Lnet/minecraft/world/inventory/ChestMenu;", cancellable = true)
    private static void sixRows__1926027284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1926027284L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "twoRows(ILnet/minecraft/world/entity/player/Inventory;)Lnet/minecraft/world/inventory/ChestMenu;", cancellable = true)
    private static void twoRows_198657346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(198657346L))
            info.setReturnValue(null);
    }


}
