package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.LocationPredicate.Builder.class)
public class Builder_794681709Mixin {
        @Inject(at = @At("HEAD"), method = "location()Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;", cancellable = true)
    private static void location_2127858821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2127858821L))
            info.setReturnValue(new net.minecraft.advancements.predicates.LocationPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/advancements/predicates/LocationPredicate;", cancellable = true)
    private void build__1667139413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1667139413L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBlock(Lnet/minecraft/advancements/predicates/BlockPredicate$Builder;)Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;", cancellable = true)
    private void setBlock__1674836326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1674836326L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setX(Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;)Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;", cancellable = true)
    private void setX_1088422795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1088422795L))
            info.setReturnValue(new net.minecraft.advancements.predicates.LocationPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setY(Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;)Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;", cancellable = true)
    private void setY__721480790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-721480790L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setZ(Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;)Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;", cancellable = true)
    private void setZ_1763582921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1763582921L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inDimension(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;", cancellable = true)
    private static void inDimension__1462755297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1462755297L))
            info.setReturnValue(new net.minecraft.advancements.predicates.LocationPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "inStructure(Lnet/minecraft/core/Holder;)Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;", cancellable = true)
    private static void inStructure_122086583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(122086583L))
            info.setReturnValue(new net.minecraft.advancements.predicates.LocationPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setStructures(Lnet/minecraft/core/HolderSet;)Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;", cancellable = true)
    private void setStructures_1146288213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1146288213L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "atYLocation(Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;)Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;", cancellable = true)
    private static void atYLocation_921211134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(921211134L))
            info.setReturnValue(new net.minecraft.advancements.predicates.LocationPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setCanSeeSky(Z)Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;", cancellable = true)
    private void setCanSeeSky_1550643880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1550643880L))
            info.setReturnValue(new net.minecraft.advancements.predicates.LocationPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setDimension(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;", cancellable = true)
    private void setDimension_267665610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(267665610L))
            info.setReturnValue(new net.minecraft.advancements.predicates.LocationPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setLight(Lnet/minecraft/advancements/predicates/LightPredicate$Builder;)Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;", cancellable = true)
    private void setLight__1123804870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1123804870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setFluid(Lnet/minecraft/advancements/predicates/FluidPredicate$Builder;)Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;", cancellable = true)
    private void setFluid__1999909446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1999909446L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inBiome(Lnet/minecraft/core/Holder;)Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;", cancellable = true)
    private static void inBiome__350181020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-350181020L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSmokey(Z)Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;", cancellable = true)
    private void setSmokey_1112560920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1112560920L))
            info.setReturnValue(new net.minecraft.advancements.predicates.LocationPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setBiomes(Lnet/minecraft/core/HolderSet;)Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;", cancellable = true)
    private void setBiomes__171571198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-171571198L))
            info.setReturnValue(new net.minecraft.advancements.predicates.LocationPredicate.Builder());
    }


}
