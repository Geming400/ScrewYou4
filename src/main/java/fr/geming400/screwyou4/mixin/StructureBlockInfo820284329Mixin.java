package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate.StructureBlockInfo.class)
public class StructureBlockInfo820284329Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__88341939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-88341939L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1590707358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1590707358L))
            info.setReturnValue("08l\u6C0FN2\u1616\u981EEFE\u080A\uBCEE(;c\uCA34l8\u329AZTv?[/Q5Wp\u7B77hEqxDF\u25757\u2ECB<*yk?/Bm");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1377636420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1377636420L))
            info.setReturnValue(-1383548726);
    }

    @Inject(at = @At("HEAD"), method = "state()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void state_488773992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(488773992L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__1460491946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1460491946L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nbt()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void nbt__676288735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-676288735L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }


}
