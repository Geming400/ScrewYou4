package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate.StructureBlockInfo.class)
public class StructureBlockInfo820284329Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2089170708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2089170708L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__315176142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-315176142L))
            info.setReturnValue("]}");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_858547071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(858547071L))
            info.setReturnValue(381565650);
    }

    @Inject(at = @At("HEAD"), method = "state()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void state__1475474537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1475474537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__1073102550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1073102550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nbt()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void nbt__749938591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-749938591L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }


}
