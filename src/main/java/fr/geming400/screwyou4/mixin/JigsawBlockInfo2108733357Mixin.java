package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate.JigsawBlockInfo.class)
public class JigsawBlockInfo2108733357Mixin {
        @Inject(at = @At("HEAD"), method = "name()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void name__334333196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-334333196L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__800721680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-800721680L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "target()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void target__334333196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-334333196L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_973272886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(973272886L))
            info.setReturnValue("ja;]{SDU QB\uCF77IQ K\u3BA5Ra\u4AAAsXX8kC)TEDpn?XQ>Wm|;@>9/W\uA2DB;Pqg\"V<+jM5BF)X\u920F-=\"N\u0B9EJ$>c2mQgMw;s");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2146996099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2146996099L))
            info.setReturnValue(1722483584);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplate$StructureBlockInfo;)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplate$JigsawBlockInfo;", cancellable = true)
    private static void of_1792301462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1792301462L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "info()Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplate$StructureBlockInfo;", cancellable = true)
    private void info__1048441063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1048441063L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pool()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void pool__1377742626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1377742626L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withInfo(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplate$StructureBlockInfo;)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplate$JigsawBlockInfo;", cancellable = true)
    private void withInfo_1792301214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1792301214L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placementPriority()I", cancellable = true)
    private void placementPriority_2146995603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2146995603L))
            info.setReturnValue(1925631004);
    }

    @Inject(at = @At("HEAD"), method = "selectionPriority()I", cancellable = true)
    private void selectionPriority_2146995603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2146995603L))
            info.setReturnValue(1925631004);
    }

    @Inject(at = @At("HEAD"), method = "jointType()Lnet/minecraft/world/level/block/entity/JigsawBlockEntity$JointType;", cancellable = true)
    private void jointType__709364646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-709364646L))
            info.setReturnValue(net.minecraft.world.level.block.entity.JigsawBlockEntity.JointType.ROLLABLE);
    }


}
