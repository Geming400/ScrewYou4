package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings.class)
public class StructurePlaceSettings929318761Mixin {
        @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;", cancellable = true)
    private void copy__469881358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-469881358L))
            info.setReturnValue(new net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings());
    }

    @Inject(at = @At("HEAD"), method = "getRandom(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void getRandom__1582102653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1582102653L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMirror()Lnet/minecraft/world/level/block/Mirror;", cancellable = true)
    private void getMirror__156816721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-156816721L))
            info.setReturnValue(net.minecraft.world.level.block.Mirror.LEFT_RIGHT);
    }

    @Inject(at = @At("HEAD"), method = "getBoundingBox()Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void getBoundingBox__527756348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-527756348L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBoundingBox(Lnet/minecraft/world/level/levelgen/structure/BoundingBox;)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;", cancellable = true)
    private void setBoundingBox__1344448745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1344448745L))
            info.setReturnValue(new net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings());
    }

    @Inject(at = @At("HEAD"), method = "getRotation()Lnet/minecraft/world/level/block/Rotation;", cancellable = true)
    private void getRotation_34633615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(34633615L))
            info.setReturnValue(net.minecraft.world.level.block.Rotation.COUNTERCLOCKWISE_90);
    }

    @Inject(at = @At("HEAD"), method = "clearProcessors()Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;", cancellable = true)
    private void clearProcessors__1295935541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1295935541L))
            info.setReturnValue(new net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings());
    }

    @Inject(at = @At("HEAD"), method = "addProcessor(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureProcessor;)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;", cancellable = true)
    private void addProcessor__703380095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-703380095L))
            info.setReturnValue(new net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings());
    }

    @Inject(at = @At("HEAD"), method = "setKnownShape(Z)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;", cancellable = true)
    private void setKnownShape_488645907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(488645907L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isIgnoreEntities()Z", cancellable = true)
    private void isIgnoreEntities_1957512131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1957512131L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setRotation(Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;", cancellable = true)
    private void setRotation__497129174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-497129174L))
            info.setReturnValue(new net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings());
    }

    @Inject(at = @At("HEAD"), method = "setIgnoreEntities(Z)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;", cancellable = true)
    private void setIgnoreEntities__794413538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-794413538L))
            info.setReturnValue(new net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings());
    }

    @Inject(at = @At("HEAD"), method = "setMirror(Lnet/minecraft/world/level/block/Mirror;)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;", cancellable = true)
    private void setMirror__2074652756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2074652756L))
            info.setReturnValue(new net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings());
    }

    @Inject(at = @At("HEAD"), method = "setRandom(Lnet/minecraft/util/RandomSource;)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;", cancellable = true)
    private void setRandom__1717965896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1717965896L))
            info.setReturnValue(new net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings());
    }

    @Inject(at = @At("HEAD"), method = "getRandomPalette(Ljava/util/List;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplate$Palette;", cancellable = true)
    private void getRandomPalette__1215557167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1215557167L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldFinalizeEntities()Z", cancellable = true)
    private void shouldFinalizeEntities__2008542578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2008542578L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getRotationPivot()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getRotationPivot__918936836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-918936836L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getKnownShape()Z", cancellable = true)
    private void getKnownShape_1337648012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1337648012L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "shouldApplyWaterlogging()Z", cancellable = true)
    private void shouldApplyWaterlogging__1814290563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1814290563L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setRotationPivot(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;", cancellable = true)
    private void setRotationPivot_886835783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(886835783L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLiquidSettings(Lnet/minecraft/world/level/levelgen/structure/templatesystem/LiquidSettings;)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;", cancellable = true)
    private void setLiquidSettings__333041615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-333041615L))
            info.setReturnValue(new net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings());
    }

    @Inject(at = @At("HEAD"), method = "getProcessors()Ljava/util/List;", cancellable = true)
    private void getProcessors__1408089552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1408089552L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setFinalizeEntities(Z)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;", cancellable = true)
    private void setFinalizeEntities__342337070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-342337070L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "popProcessor(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureProcessor;)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;", cancellable = true)
    private void popProcessor__560111151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-560111151L))
            info.setReturnValue(null);
    }


}
