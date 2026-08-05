package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.BlockBehaviour.Properties.class)
public class Properties334716001Mixin {
        @Inject(at = @At("HEAD"), method = "of()Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private static void of_1018178706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1018178706L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "strength(FF)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void strength__1871877542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1871877542L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "strength(F)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void strength_1733170576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1733170576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setId(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void setId_1437704222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1437704222L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requiresCorrectToolForDrops()Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void requiresCorrectToolForDrops_1018178458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1018178458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mapColor(Lnet/minecraft/world/item/DyeColor;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void mapColor_1236875443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1236875443L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mapColor(Ljava/util/function/Function;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void mapColor__1579086174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1579086174L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mapColor(Lnet/minecraft/world/level/material/MapColor;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void mapColor__1042375586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1042375586L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "jumpFactor(F)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void jumpFactor_1733170576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1733170576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "friction(F)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void friction_1733170576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1733170576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sound(Lnet/minecraft/world/level/block/SoundType;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void sound_1373513990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1373513990L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "destroyTime(F)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void destroyTime_1733170576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1733170576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "speedFactor(F)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void speedFactor_1733170576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1733170576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "explosionResistance(F)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void explosionResistance_1733170576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1733170576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bounceRestitution(F)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void bounceRestitution_1733170576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1733170576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dynamicShape()Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void dynamicShape_1018178458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1018178458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requiredFeatures([Lnet/minecraft/world/flag/FeatureFlag;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void requiredFeatures_1186594660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1186594660L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "air()Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void air_1018178458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1018178458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instabreak()Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void instabreak_1018178458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1018178458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ofFullCopy(Lnet/minecraft/world/level/block/state/BlockBehaviour;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private static void ofFullCopy_1103521941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1103521941L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offsetType(Lnet/minecraft/world/level/block/state/BlockBehaviour$OffsetType;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void offsetType__192905300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-192905300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "liquid()Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void liquid_1018178458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1018178458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instrument(Lnet/minecraft/world/level/block/state/properties/NoteBlockInstrument;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void instrument__1441242841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1441242841L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "postProcess(Lnet/minecraft/world/level/block/state/BlockBehaviour$PostProcess;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void postProcess__819028078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-819028078L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isRedstoneConductor(Lnet/minecraft/world/level/block/state/BlockBehaviour$StatePredicate;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void isRedstoneConductor_396458899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(396458899L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isViewBlocking(Lnet/minecraft/world/level/block/state/BlockBehaviour$StatePredicate;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void isViewBlocking_396458899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(396458899L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forceSolidOff()Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void forceSolidOff_1018178458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1018178458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidSpawn(Lnet/minecraft/world/level/block/state/BlockBehaviour$StateArgumentPredicate;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void isValidSpawn_1134502576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1134502576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "replaceable()Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void replaceable_1018178458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1018178458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forceSolidOn()Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void forceSolidOn_1018178458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1018178458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ignitedByLava()Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void ignitedByLava_1018178458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1018178458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pushReaction(Lnet/minecraft/world/level/material/PushReaction;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void pushReaction__898556446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-898556446L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emissiveRendering(Ljava/util/function/Predicate;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void emissiveRendering__589972695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-589972695L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSuffocating(Lnet/minecraft/world/level/block/state/BlockBehaviour$StatePredicate;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void isSuffocating_396458899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(396458899L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noCollision()Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void noCollision_1018178458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1018178458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noOcclusion()Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void noOcclusion_1018178458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1018178458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "randomTicks()Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void randomTicks_1018178458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1018178458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overrideLootTable(Ljava/util/Optional;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void overrideLootTable_863809225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(863809225L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ofLegacyCopy(Lnet/minecraft/world/level/block/state/BlockBehaviour;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private static void ofLegacyCopy_1103521941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1103521941L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noTerrainParticles()Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void noTerrainParticles_1018178458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1018178458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overrideDescription(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void overrideDescription_2108848036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2108848036L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noLootTable()Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void noLootTable_1018178458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1018178458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lightLevel(Ljava/util/function/ToIntFunction;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void lightLevel__1279519468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1279519468L))
            info.setReturnValue(null);
    }


}
