package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings.class)
public class StructurePlaceSettings929318761Mixin {
        @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;", cancellable = true)
    private void copy__1382582915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1382582915L))
            info.setReturnValue(new net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings());
    }

    @Inject(at = @At("HEAD"), method = "getRandom(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void getRandom_1305760266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1305760266L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMirror()Lnet/minecraft/world/level/block/Mirror;", cancellable = true)
    private void getMirror__1610213510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1610213510L))
            info.setReturnValue(net.minecraft.world.level.block.Mirror.LEFT_RIGHT);
    }

    @Inject(at = @At("HEAD"), method = "setFinalizeEntities(Z)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;", cancellable = true)
    private void setFinalizeEntities_1285076275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1285076275L))
            info.setReturnValue(new net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings());
    }

    @Inject(at = @At("HEAD"), method = "popProcessor(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureProcessor;)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;", cancellable = true)
    private void popProcessor_1898693008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1898693008L))
            info.setReturnValue(new net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings());
    }

    @Inject(at = @At("HEAD"), method = "getRotation()Lnet/minecraft/world/level/block/Rotation;", cancellable = true)
    private void getRotation__569002597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-569002597L))
            info.setReturnValue(net.minecraft.world.level.block.Rotation.CLOCKWISE_90);
    }

    @Inject(at = @At("HEAD"), method = "getKnownShape()Z", cancellable = true)
    private void getKnownShape_967597344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(967597344L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldApplyWaterlogging()Z", cancellable = true)
    private void shouldApplyWaterlogging_967597344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(967597344L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getRandomPalette(Ljava/util/List;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplate$Palette;", cancellable = true)
    private void getRandomPalette_281419599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(281419599L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldFinalizeEntities()Z", cancellable = true)
    private void shouldFinalizeEntities_967597344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(967597344L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getRotationPivot()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getRotationPivot__964068118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-964068118L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addProcessor(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureProcessor;)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;", cancellable = true)
    private void addProcessor_1898693008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1898693008L))
            info.setReturnValue(new net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings());
    }

    @Inject(at = @At("HEAD"), method = "isIgnoreEntities()Z", cancellable = true)
    private void isIgnoreEntities_967597344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(967597344L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setKnownShape(Z)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;", cancellable = true)
    private void setKnownShape_1285076275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1285076275L))
            info.setReturnValue(new net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings());
    }

    @Inject(at = @At("HEAD"), method = "setIgnoreEntities(Z)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;", cancellable = true)
    private void setIgnoreEntities_1285076275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1285076275L))
            info.setReturnValue(new net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings());
    }

    @Inject(at = @At("HEAD"), method = "setRotation(Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;", cancellable = true)
    private void setRotation__79283414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-79283414L))
            info.setReturnValue(new net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings());
    }

    @Inject(at = @At("HEAD"), method = "clearProcessors()Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;", cancellable = true)
    private void clearProcessors__1382582915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1382582915L))
            info.setReturnValue(new net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings());
    }

    @Inject(at = @At("HEAD"), method = "getBoundingBox()Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void getBoundingBox_1099466547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1099466547L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBoundingBox(Lnet/minecraft/world/level/levelgen/structure/BoundingBox;)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;", cancellable = true)
    private void setBoundingBox_1445398162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1445398162L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setRotationPivot(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;", cancellable = true)
    private void setRotationPivot_713971497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(713971497L))
            info.setReturnValue(new net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings());
    }

    @Inject(at = @At("HEAD"), method = "setLiquidSettings(Lnet/minecraft/world/level/levelgen/structure/templatesystem/LiquidSettings;)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;", cancellable = true)
    private void setLiquidSettings_1154099760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1154099760L))
            info.setReturnValue(new net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings());
    }

    @Inject(at = @At("HEAD"), method = "getProcessors()Ljava/util/List;", cancellable = true)
    private void getProcessors__1739311719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1739311719L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMirror(Lnet/minecraft/world/level/block/Mirror;)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;", cancellable = true)
    private void setMirror__1757766421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1757766421L))
            info.setReturnValue(new net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings());
    }

    @Inject(at = @At("HEAD"), method = "setRandom(Lnet/minecraft/util/RandomSource;)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;", cancellable = true)
    private void setRandom__2105650211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2105650211L))
            info.setReturnValue(null);
    }


}
