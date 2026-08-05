package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.player.StackedItemContents.class)
public class StackedItemContents_1031637210Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_1069911948(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1069911948L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "accountStack(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void accountStack__1528798799(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1528798799L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "accountStack(Lnet/minecraft/world/item/ItemStack;I)V", cancellable = true)
    private void accountStack__1005067648(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1005067648L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBiggestCraftableStack(Lnet/minecraft/world/item/crafting/Recipe;ILnet/minecraft/world/entity/player/StackedContents$Output;)I", cancellable = true)
    private void getBiggestCraftableStack_603499761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(603499761L))
            info.setReturnValue(-417456037);
    }

    @Inject(at = @At("HEAD"), method = "getBiggestCraftableStack(Lnet/minecraft/world/item/crafting/Recipe;Lnet/minecraft/world/entity/player/StackedContents$Output;)I", cancellable = true)
    private void getBiggestCraftableStack_1617824406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1617824406L))
            info.setReturnValue(494138348);
    }

    @Inject(at = @At("HEAD"), method = "canCraft(Lnet/minecraft/world/item/crafting/Recipe;ILnet/minecraft/world/entity/player/StackedContents$Output;)Z", cancellable = true)
    private void canCraft_603516098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(603516098L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canCraft(Ljava/util/List;Lnet/minecraft/world/entity/player/StackedContents$Output;)Z", cancellable = true)
    private void canCraft__757146247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-757146247L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canCraft(Lnet/minecraft/world/item/crafting/Recipe;Lnet/minecraft/world/entity/player/StackedContents$Output;)Z", cancellable = true)
    private void canCraft_1617840743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1617840743L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "accountSimpleStack(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void accountSimpleStack__1528798799(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1528798799L))
            info.cancel();
    }


}
