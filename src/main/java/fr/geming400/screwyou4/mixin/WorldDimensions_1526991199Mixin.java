package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.WorldDimensions.class)
public class WorldDimensions_1526991199Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/resources/ResourceKey;)Ljava/util/Optional;", cancellable = true)
    private void get__792727544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-792727544L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1382463839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1382463839L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_391531223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(391531223L))
            info.setReturnValue("c;f\u871FXHwy7@ALL\u9802mE7-+u;");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1565253940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1565253940L))
            info.setReturnValue(2062184324);
    }

    @Inject(at = @At("HEAD"), method = "dimensions()Ljava/util/Map;", cancellable = true)
    private void dimensions__477632442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-477632442L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDebug()Z", cancellable = true)
    private void isDebug_1565269781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1565269781L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "levels()Lcom/google/common/collect/ImmutableSet;", cancellable = true)
    private void levels__1847308757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1847308757L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overworld()Lnet/minecraft/world/level/chunk/ChunkGenerator;", cancellable = true)
    private void overworld__270001208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-270001208L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withOverworld(Lnet/minecraft/core/HolderLookup;Ljava/util/Map;Lnet/minecraft/world/level/chunk/ChunkGenerator;)Ljava/util/Map;", cancellable = true)
    private static void withOverworld_638350095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(638350095L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withOverworld(Ljava/util/Map;Lnet/minecraft/core/Holder;Lnet/minecraft/world/level/chunk/ChunkGenerator;)Ljava/util/Map;", cancellable = true)
    private static void withOverworld__1757608675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1757608675L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "keysInOrder(Ljava/util/Set;)Ljava/util/stream/Stream;", cancellable = true)
    private static void keysInOrder__592866880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-592866880L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/core/Registry;)Lnet/minecraft/world/level/levelgen/WorldDimensions$Complete;", cancellable = true)
    private void bake__1589319173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1589319173L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "replaceOverworldGenerator(Lnet/minecraft/core/HolderLookup$Provider;Lnet/minecraft/world/level/chunk/ChunkGenerator;)Lnet/minecraft/world/level/levelgen/WorldDimensions;", cancellable = true)
    private void replaceOverworldGenerator_702538477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(702538477L))
            info.setReturnValue(null);
    }


}
