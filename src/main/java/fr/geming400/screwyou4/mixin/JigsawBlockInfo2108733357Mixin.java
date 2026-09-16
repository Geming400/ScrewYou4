package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate.JigsawBlockInfo.class)
public class JigsawBlockInfo2108733357Mixin {
        @Inject(at = @At("HEAD"), method = "name()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void name_750472831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(750472831L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1200107089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1200107089L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "target()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void target_994330501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(994330501L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1415810910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1415810910L))
            info.setReturnValue(">Q \u100CNkB\u4C2E+V\u26E9Mn6gTzP\u9385\u61D0Yu^\uBA7D\u88E5!3SN|H\u1A2DF: \uD0C7\u493B7T'BCq\u1D7B\u2594q}?\u4F34\uB1C5>AV\uC073NK\uFB93kqQa9e\"\u9CC32>V");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1628881848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1628881848L))
            info.setReturnValue(1362232579);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplate$StructureBlockInfo;)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplate$JigsawBlockInfo;", cancellable = true)
    private static void of__1445199329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1445199329L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "info()Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplate$StructureBlockInfo;", cancellable = true)
    private void info__536342201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-536342201L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pool()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void pool_1590265922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1590265922L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placementPriority()I", cancellable = true)
    private void placementPriority_767701898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(767701898L))
            info.setReturnValue(2013819518);
    }

    @Inject(at = @At("HEAD"), method = "selectionPriority()I", cancellable = true)
    private void selectionPriority_954145859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(954145859L))
            info.setReturnValue(-1611690566);
    }

    @Inject(at = @At("HEAD"), method = "jointType()Lnet/minecraft/world/level/block/entity/JigsawBlockEntity$JointType;", cancellable = true)
    private void jointType_1181886270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1181886270L))
            info.setReturnValue(net.minecraft.world.level.block.entity.JigsawBlockEntity.JointType.ROLLABLE);
    }

    @Inject(at = @At("HEAD"), method = "withInfo(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplate$StructureBlockInfo;)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplate$JigsawBlockInfo;", cancellable = true)
    private void withInfo__1156940150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1156940150L))
            info.setReturnValue(null);
    }


}
