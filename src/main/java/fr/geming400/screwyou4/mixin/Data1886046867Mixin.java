package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.TestInstanceBlockEntity.Data.class)
public class Data1886046867Mixin {
        @Inject(at = @At("HEAD"), method = "size()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void size_1501648403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1501648403L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1023408170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1023408170L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_750586892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(750586892L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1924309609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1924309609L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test()Ljava/util/Optional;", cancellable = true)
    private void test_2131508289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2131508289L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "status()Lnet/minecraft/world/level/block/entity/TestInstanceBlockEntity$Status;", cancellable = true)
    private void status_1244208348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1244208348L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withStatus(Lnet/minecraft/world/level/block/entity/TestInstanceBlockEntity$Status;)Lnet/minecraft/world/level/block/entity/TestInstanceBlockEntity$Data;", cancellable = true)
    private void withStatus__1976121856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1976121856L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ignoreEntities()Z", cancellable = true)
    private void ignoreEntities_1924325450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1924325450L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotation()Lnet/minecraft/world/level/block/Rotation;", cancellable = true)
    private void rotation_387725509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(387725509L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withSize(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/world/level/block/entity/TestInstanceBlockEntity$Data;", cancellable = true)
    private void withSize_1805162853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1805162853L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "errorMessage()Ljava/util/Optional;", cancellable = true)
    private void errorMessage_2131508289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2131508289L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withError(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/world/level/block/entity/TestInstanceBlockEntity$Data;", cancellable = true)
    private void withError_198556088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(198556088L))
            info.setReturnValue(null);
    }


}
