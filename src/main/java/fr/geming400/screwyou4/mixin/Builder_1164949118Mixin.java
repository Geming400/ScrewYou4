package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.BlockFamily.Builder.class)
public class Builder_1164949118Mixin {
        @Inject(at = @At("HEAD"), method = "log(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void log_2032519628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032519628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fence(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void fence_2032519628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032519628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sign(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void sign_1143830804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1143830804L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFamily()Lnet/minecraft/data/BlockFamily;", cancellable = true)
    private void getFamily__762579125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-762579125L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wall(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void wall_2032519628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032519628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "customFenceGate(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void customFenceGate_2032519628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032519628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "customFence(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void customFence_2032519628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032519628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "customHangingSign(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void customHangingSign_1143830804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1143830804L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hangingSign(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void hangingSign_1143830804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1143830804L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pressurePlate(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void pressurePlate_2032519628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032519628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "door(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void door_2032519628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032519628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "trapdoor(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void trapdoor_2032519628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032519628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "button(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void button_2032519628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032519628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cut(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void cut_2032519628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032519628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fenceGate(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void fenceGate_2032519628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032519628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stairs(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void stairs_2032519628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032519628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slab(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void slab_2032519628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032519628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pillar(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void pillar_2032519628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032519628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bricks(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void bricks_2032519628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032519628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mosaic(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void mosaic_2032519628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032519628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "polished(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void polished_2032519628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032519628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chiseled(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void chiseled_2032519628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032519628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tiles(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void tiles_2032519628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032519628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cracked(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void cracked_2032519628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032519628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cobbled(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void cobbled_2032519628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032519628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dontGenerateModel()Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void dontGenerateModel_1609660436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1609660436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recipeGroupPrefix(Ljava/lang/String;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void recipeGroupPrefix_1839056074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1839056074L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recipeUnlockedBy(Ljava/lang/String;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void recipeUnlockedBy_1839056074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1839056074L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateStonecutterRecipe()Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void generateStonecutterRecipe_1609660436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1609660436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "strippedLog(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void strippedLog_2032519628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032519628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dontGenerateCraftingRecipe()Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void dontGenerateCraftingRecipe_1609660436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1609660436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dontGenerateSmeltingRecipe()Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void dontGenerateSmeltingRecipe_1609660436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1609660436L))
            info.setReturnValue(null);
    }


}
