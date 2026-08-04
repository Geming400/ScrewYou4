package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.BlockModelGenerators.BlockFamilyProvider.class)
public class BlockFamilyProvider_1898278322Mixin {
        @Inject(at = @At("HEAD"), method = "fence(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/BlockModelGenerators$BlockFamilyProvider;", cancellable = true)
    private void fence__131249645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-131249645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sign(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/BlockModelGenerators$BlockFamilyProvider;", cancellable = true)
    private void sign__131249645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-131249645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wall(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/BlockModelGenerators$BlockFamilyProvider;", cancellable = true)
    private void wall__131249645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-131249645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fullBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/model/ModelTemplate;)Lnet/minecraft/client/data/models/BlockModelGenerators$BlockFamilyProvider;", cancellable = true)
    private void fullBlock__834215819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-834215819L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stairs(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/BlockModelGenerators$BlockFamilyProvider;", cancellable = true)
    private void stairs__131249645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-131249645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slab(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/BlockModelGenerators$BlockFamilyProvider;", cancellable = true)
    private void slab__131249645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-131249645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fenceGate(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/BlockModelGenerators$BlockFamilyProvider;", cancellable = true)
    private void fenceGate__131249645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-131249645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "customHangingSign(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/BlockModelGenerators$BlockFamilyProvider;", cancellable = true)
    private void customHangingSign__131249645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-131249645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateFor(Lnet/minecraft/data/BlockFamily;)Lnet/minecraft/client/data/models/BlockModelGenerators$BlockFamilyProvider;", cancellable = true)
    private void generateFor__1034254374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1034254374L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "customFence(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/BlockModelGenerators$BlockFamilyProvider;", cancellable = true)
    private void customFence__131249645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-131249645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hangingSign(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/BlockModelGenerators$BlockFamilyProvider;", cancellable = true)
    private void hangingSign__131249645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-131249645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pressurePlate(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/BlockModelGenerators$BlockFamilyProvider;", cancellable = true)
    private void pressurePlate__131249645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-131249645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "donateModelTo(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/BlockModelGenerators$BlockFamilyProvider;", cancellable = true)
    private void donateModelTo__1055451701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1055451701L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "customFenceGate(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/BlockModelGenerators$BlockFamilyProvider;", cancellable = true)
    private void customFenceGate__131249645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-131249645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "button(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/BlockModelGenerators$BlockFamilyProvider;", cancellable = true)
    private void button__131249645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-131249645L))
            info.setReturnValue(null);
    }


}
