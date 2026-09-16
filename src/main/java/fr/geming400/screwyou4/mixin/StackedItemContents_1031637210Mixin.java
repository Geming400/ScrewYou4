package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.player.StackedItemContents.class)
public class StackedItemContents_1031637210Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_245809503(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(245809503L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "accountStack(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void accountStack_1918183350(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1918183350L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "accountStack(Lnet/minecraft/world/item/ItemStack;I)V", cancellable = true)
    private void accountStack__1522803429(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1522803429L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "accountSimpleStack(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void accountSimpleStack_1835262024(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1835262024L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBiggestCraftableStack(Lnet/minecraft/world/item/crafting/Recipe;ILnet/minecraft/world/entity/player/StackedContents$Output;)I", cancellable = true)
    private void getBiggestCraftableStack_17706056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(17706056L))
            info.setReturnValue(-2039762755);
    }

    @Inject(at = @At("HEAD"), method = "getBiggestCraftableStack(Lnet/minecraft/world/item/crafting/Recipe;Lnet/minecraft/world/entity/player/StackedContents$Output;)I", cancellable = true)
    private void getBiggestCraftableStack_1737475167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1737475167L))
            info.setReturnValue(-357429894);
    }

    @Inject(at = @At("HEAD"), method = "canCraft(Lnet/minecraft/world/item/crafting/Recipe;ILnet/minecraft/world/entity/player/StackedContents$Output;)Z", cancellable = true)
    private void canCraft__1998158606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1998158606L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canCraft(Ljava/util/List;Lnet/minecraft/world/entity/player/StackedContents$Output;)Z", cancellable = true)
    private void canCraft_463741769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(463741769L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canCraft(Lnet/minecraft/world/item/crafting/Recipe;Lnet/minecraft/world/entity/player/StackedContents$Output;)Z", cancellable = true)
    private void canCraft__128652233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-128652233L))
            info.setReturnValue(false);
    }


}
