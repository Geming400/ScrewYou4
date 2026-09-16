package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.BlockFamily.Builder.class)
public class Builder_1164949118Mixin {
        @Inject(at = @At("HEAD"), method = "log(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void log__1871685624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1871685624L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fence(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void fence__1204557317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1204557317L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sign(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void sign__991766383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-991766383L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFamily()Lnet/minecraft/data/BlockFamily;", cancellable = true)
    private void getFamily_47501477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(47501477L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wall(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void wall_864227266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(864227266L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hangingSign(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void hangingSign__589145375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-589145375L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "button(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void button__213601958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-213601958L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "door(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void door__1508906146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1508906146L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "trapdoor(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void trapdoor__1369236079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1369236079L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slab(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void slab__1070447790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1070447790L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cracked(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void cracked__1376878253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1376878253L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cut(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void cut_356998218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(356998218L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "customFence(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void customFence__1630761332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1630761332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "customHangingSign(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void customHangingSign_1891331568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1891331568L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "customFenceGate(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void customFenceGate__120713279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-120713279L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pressurePlate(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void pressurePlate_1267236443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1267236443L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bricks(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void bricks__184851398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-184851398L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stairs(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void stairs_1748740930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1748740930L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cobbled(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void cobbled_743209613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(743209613L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tiles(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void tiles__1478955481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1478955481L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chiseled(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void chiseled_1139195735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1139195735L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mosaic(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void mosaic__1485505278(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1485505278L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "polished(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void polished__1274281892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1274281892L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recipeGroupPrefix(Ljava/lang/String;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void recipeGroupPrefix__606365427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-606365427L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dontGenerateModel()Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void dontGenerateModel_1036617271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1036617271L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dontGenerateCraftingRecipe()Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void dontGenerateCraftingRecipe__1706412342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1706412342L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateStonecutterRecipe()Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void generateStonecutterRecipe__343545455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-343545455L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "strippedLog(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void strippedLog__1889804321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1889804321L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dontGenerateSmeltingRecipe()Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void dontGenerateSmeltingRecipe__1442134345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1442134345L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recipeUnlockedBy(Ljava/lang/String;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void recipeUnlockedBy__1936214638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1936214638L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fenceGate(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void fenceGate_254548912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(254548912L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pillar(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private void pillar__2059845022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2059845022L))
            info.setReturnValue(null);
    }


}
