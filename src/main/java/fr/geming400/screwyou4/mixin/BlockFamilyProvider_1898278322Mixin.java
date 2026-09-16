package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.BlockModelGenerators.BlockFamilyProvider.class)
public class BlockFamilyProvider_1898278322Mixin {
        @Inject(at = @At("HEAD"), method = "fence(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/BlockModelGenerators$BlockFamilyProvider;", cancellable = true)
    private void fence__1392082044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1392082044L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sign(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/BlockModelGenerators$BlockFamilyProvider;", cancellable = true)
    private void sign_1993338896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1993338896L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wall(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/BlockModelGenerators$BlockFamilyProvider;", cancellable = true)
    private void wall_933367901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(933367901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hangingSign(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/BlockModelGenerators$BlockFamilyProvider;", cancellable = true)
    private void hangingSign__1592976800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1592976800L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "button(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/BlockModelGenerators$BlockFamilyProvider;", cancellable = true)
    private void button_1614694341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1614694341L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slab(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/BlockModelGenerators$BlockFamilyProvider;", cancellable = true)
    private void slab__1336036659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1336036659L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "customFence(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/BlockModelGenerators$BlockFamilyProvider;", cancellable = true)
    private void customFence__681947821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-681947821L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateFor(Lnet/minecraft/data/BlockFamily;)Lnet/minecraft/client/data/models/BlockModelGenerators$BlockFamilyProvider;", cancellable = true)
    private void generateFor__2052596154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2052596154L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "customHangingSign(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/BlockModelGenerators$BlockFamilyProvider;", cancellable = true)
    private void customHangingSign_198184175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(198184175L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "customFenceGate(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/BlockModelGenerators$BlockFamilyProvider;", cancellable = true)
    private void customFenceGate_1647826942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1647826942L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pressurePlate(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/BlockModelGenerators$BlockFamilyProvider;", cancellable = true)
    private void pressurePlate__578907356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-578907356L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "donateModelTo(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/BlockModelGenerators$BlockFamilyProvider;", cancellable = true)
    private void donateModelTo_1512527830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1512527830L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stairs(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/BlockModelGenerators$BlockFamilyProvider;", cancellable = true)
    private void stairs_1856488669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1856488669L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fullBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/model/ModelTemplate;)Lnet/minecraft/client/data/models/BlockModelGenerators$BlockFamilyProvider;", cancellable = true)
    private void fullBlock_1218612915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1218612915L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fenceGate(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/BlockModelGenerators$BlockFamilyProvider;", cancellable = true)
    private void fenceGate_2106297775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2106297775L))
            info.setReturnValue(null);
    }


}
