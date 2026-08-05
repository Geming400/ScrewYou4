package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.BlockBehaviour.Properties.class)
public class Properties334716001Mixin {
        @Inject(at = @At("HEAD"), method = "of()Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private static void of_1711891739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1711891739L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "strength(F)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void strength__1737496303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1737496303L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "strength(FF)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void strength__2088368391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2088368391L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setId(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void setId__36194053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-36194053L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSuffocating(Lnet/minecraft/world/level/block/state/BlockBehaviour$StatePredicate;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void isSuffocating__1707921950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1707921950L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ignitedByLava()Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void ignitedByLava_84712361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(84712361L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emissiveRendering(Ljava/util/function/Predicate;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void emissiveRendering__1600899820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1600899820L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "replaceable()Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void replaceable_917268044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(917268044L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isViewBlocking(Lnet/minecraft/world/level/block/state/BlockBehaviour$StatePredicate;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void isViewBlocking__504086825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-504086825L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forceSolidOn()Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void forceSolidOn_677931643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(677931643L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "postProcess(Lnet/minecraft/world/level/block/state/BlockBehaviour$PostProcess;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void postProcess__558763261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-558763261L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidSpawn(Lnet/minecraft/world/level/block/state/BlockBehaviour$StateArgumentPredicate;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void isValidSpawn__262412263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-262412263L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pushReaction(Lnet/minecraft/world/level/material/PushReaction;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void pushReaction_202207493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(202207493L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forceSolidOff()Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void forceSolidOff_1476963883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1476963883L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noOcclusion()Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void noOcclusion__89208242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-89208242L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ofLegacyCopy(Lnet/minecraft/world/level/block/state/BlockBehaviour;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private static void ofLegacyCopy_1516497760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1516497760L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "randomTicks()Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void randomTicks__1243126777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1243126777L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noLootTable()Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void noLootTable__821531275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-821531275L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noTerrainParticles()Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void noTerrainParticles_635725921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(635725921L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overrideDescription(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void overrideDescription_1802460436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1802460436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overrideLootTable(Ljava/util/Optional;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void overrideLootTable__1981257617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1981257617L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dynamicShape()Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void dynamicShape_1919140408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1919140408L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "speedFactor(F)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void speedFactor_333449606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(333449606L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "explosionResistance(F)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void explosionResistance__821306306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-821306306L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bounceRestitution(F)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void bounceRestitution__1149195054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1149195054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "destroyTime(F)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void destroyTime_268758583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(268758583L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isRedstoneConductor(Lnet/minecraft/world/level/block/state/BlockBehaviour$StatePredicate;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void isRedstoneConductor__1946139044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1946139044L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noCollision()Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void noCollision__305016887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-305016887L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "liquid()Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void liquid__1351071778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1351071778L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lightLevel(Ljava/util/function/ToIntFunction;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void lightLevel__1064108730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1064108730L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mapColor(Ljava/util/function/Function;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void mapColor_1982877769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1982877769L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mapColor(Lnet/minecraft/world/level/material/MapColor;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void mapColor__665079803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-665079803L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mapColor(Lnet/minecraft/world/item/DyeColor;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void mapColor_1577345306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1577345306L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "jumpFactor(F)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void jumpFactor_1307615981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1307615981L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "friction(F)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void friction__1948047094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1948047094L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sound(Lnet/minecraft/world/level/block/SoundType;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void sound_2074148885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2074148885L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requiredFeatures([Lnet/minecraft/world/flag/FeatureFlag;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void requiredFeatures__1881408928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1881408928L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requiresCorrectToolForDrops()Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void requiresCorrectToolForDrops__612683733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-612683733L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "air()Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void air_467026064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(467026064L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instrument(Lnet/minecraft/world/level/block/state/properties/NoteBlockInstrument;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void instrument_1572259552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1572259552L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offsetType(Lnet/minecraft/world/level/block/state/BlockBehaviour$OffsetType;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void offsetType__1880076199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1880076199L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ofFullCopy(Lnet/minecraft/world/level/block/state/BlockBehaviour;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private static void ofFullCopy_228602394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(228602394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instabreak()Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private void instabreak__760969450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-760969450L))
            info.setReturnValue(null);
    }


}
