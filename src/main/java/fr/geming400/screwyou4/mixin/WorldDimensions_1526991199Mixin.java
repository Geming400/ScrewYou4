package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.WorldDimensions.class)
public class WorldDimensions_1526991199Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/resources/ResourceKey;)Ljava/util/Optional;", cancellable = true)
    private void get__307085198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-307085198L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_618364930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(618364930L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1997552573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1997552573L))
            info.setReturnValue(">$w\u363B0AP}$\u3B29 @a15g(hsq^\"e9/B3hq\u0C99`6U\uCC8Awyfjr4+B]+?B|\u227DP)ugO\u4793/\"4zrjd.\u25CE\uC34F\u1E20");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2084343289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2084343289L))
            info.setReturnValue(454595796);
    }

    @Inject(at = @At("HEAD"), method = "dimensions()Ljava/util/Map;", cancellable = true)
    private void dimensions_703591257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(703591257L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDebug()Z", cancellable = true)
    private void isDebug_1805025644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1805025644L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "levels()Lcom/google/common/collect/ImmutableSet;", cancellable = true)
    private void levels_134150426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(134150426L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "replaceOverworldGenerator(Lnet/minecraft/core/HolderLookup$Provider;Lnet/minecraft/world/level/chunk/ChunkGenerator;)Lnet/minecraft/world/level/levelgen/WorldDimensions;", cancellable = true)
    private void replaceOverworldGenerator_1259104694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1259104694L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/core/Registry;)Lnet/minecraft/world/level/levelgen/WorldDimensions$Complete;", cancellable = true)
    private void bake__1346329068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1346329068L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overworld()Lnet/minecraft/world/level/chunk/ChunkGenerator;", cancellable = true)
    private void overworld_2087279622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2087279622L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "keysInOrder(Ljava/util/Set;)Ljava/util/stream/Stream;", cancellable = true)
    private static void keysInOrder_1703497429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703497429L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withOverworld(Lnet/minecraft/core/HolderLookup;Ljava/util/Map;Lnet/minecraft/world/level/chunk/ChunkGenerator;)Ljava/util/Map;", cancellable = true)
    private static void withOverworld_499145463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(499145463L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withOverworld(Ljava/util/Map;Lnet/minecraft/core/Holder;Lnet/minecraft/world/level/chunk/ChunkGenerator;)Ljava/util/Map;", cancellable = true)
    private static void withOverworld__1101595899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1101595899L))
            info.setReturnValue(null);
    }


}
