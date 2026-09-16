package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.TestInstanceBlockEntity.Data.class)
public class Data1886046867Mixin {
        @Inject(at = @At("HEAD"), method = "size()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void size__1827144108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1827144108L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_977420599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(977420599L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1638496904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1638496904L))
            info.setReturnValue("P\uC19CkN]#n:qT");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1851568338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1851568338L))
            info.setReturnValue(1863139889);
    }

    @Inject(at = @At("HEAD"), method = "test()Ljava/util/Optional;", cancellable = true)
    private void test__180196653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-180196653L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "status()Lnet/minecraft/world/level/block/entity/TestInstanceBlockEntity$Status;", cancellable = true)
    private void status__858467926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-858467926L))
            info.setReturnValue(net.minecraft.world.level.block.entity.TestInstanceBlockEntity.Status.RUNNING);
    }

    @Inject(at = @At("HEAD"), method = "withStatus(Lnet/minecraft/world/level/block/entity/TestInstanceBlockEntity$Status;)Lnet/minecraft/world/level/block/entity/TestInstanceBlockEntity$Data;", cancellable = true)
    private void withStatus_1052104280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1052104280L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "errorMessage()Ljava/util/Optional;", cancellable = true)
    private void errorMessage_2127772704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2127772704L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ignoreEntities()Z", cancellable = true)
    private void ignoreEntities_714080375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(714080375L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "withSize(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/world/level/block/entity/TestInstanceBlockEntity$Data;", cancellable = true)
    private void withSize__731947490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-731947490L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withError(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/world/level/block/entity/TestInstanceBlockEntity$Data;", cancellable = true)
    private void withError_326857878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(326857878L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotation()Lnet/minecraft/world/level/block/Rotation;", cancellable = true)
    private void rotation_726784963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(726784963L))
            info.setReturnValue(net.minecraft.world.level.block.Rotation.NONE);
    }


}
