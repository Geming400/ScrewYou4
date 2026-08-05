package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.LocationPredicate.Builder.class)
public class Builder_794681709Mixin {
        @Inject(at = @At("HEAD"), method = "location()Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;", cancellable = true)
    private static void location__333677798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-333677798L))
            info.setReturnValue(new net.minecraft.advancements.predicates.LocationPredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/advancements/predicates/LocationPredicate;", cancellable = true)
    private void build__281835431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-281835431L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBlock(Lnet/minecraft/advancements/predicates/BlockPredicate$Builder;)Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;", cancellable = true)
    private void setBlock_142205893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(142205893L))
            info.setReturnValue(new net.minecraft.advancements.predicates.LocationPredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "setSmokey(Z)Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;", cancellable = true)
    private void setSmokey__249980372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-249980372L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inBiome(Lnet/minecraft/core/Holder;)Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;", cancellable = true)
    private static void inBiome__1847864599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1847864599L))
            info.setReturnValue(new net.minecraft.advancements.predicates.LocationPredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "setLight(Lnet/minecraft/advancements/predicates/LightPredicate$Builder;)Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;", cancellable = true)
    private void setLight__1533440114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1533440114L))
            info.setReturnValue(new net.minecraft.advancements.predicates.LocationPredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "setFluid(Lnet/minecraft/advancements/predicates/FluidPredicate$Builder;)Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;", cancellable = true)
    private void setFluid__540822206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-540822206L))
            info.setReturnValue(new net.minecraft.advancements.predicates.LocationPredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "setBiomes(Lnet/minecraft/core/HolderSet;)Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;", cancellable = true)
    private void setBiomes_59521783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(59521783L))
            info.setReturnValue(new net.minecraft.advancements.predicates.LocationPredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "setY(Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;)Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;", cancellable = true)
    private void setY_1859022081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1859022081L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setX(Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;)Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;", cancellable = true)
    private void setX_1859022081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1859022081L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setZ(Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;)Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;", cancellable = true)
    private void setZ_1859022081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1859022081L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCanSeeSky(Z)Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;", cancellable = true)
    private void setCanSeeSky__249980372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-249980372L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inStructure(Lnet/minecraft/core/Holder;)Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;", cancellable = true)
    private static void inStructure__1847864599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1847864599L))
            info.setReturnValue(new net.minecraft.advancements.predicates.LocationPredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "atYLocation(Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;)Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;", cancellable = true)
    private static void atYLocation_1859022329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1859022329L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setStructures(Lnet/minecraft/core/HolderSet;)Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;", cancellable = true)
    private void setStructures_59521783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(59521783L))
            info.setReturnValue(new net.minecraft.advancements.predicates.LocationPredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "setDimension(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;", cancellable = true)
    private void setDimension_85847718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(85847718L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inDimension(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;", cancellable = true)
    private static void inDimension_85847966(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(85847966L))
            info.setReturnValue(null);
    }


}
