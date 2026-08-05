package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.TestInstanceBlockEntity.Status.class)
public class Status_1512574565Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/entity/TestInstanceBlockEntity$Status;", cancellable = true)
    private static void values__448509108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-448509108L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/entity/TestInstanceBlockEntity$Status;", cancellable = true)
    private static void valueOf__1778516433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1778516433L))
            info.setReturnValue(net.minecraft.world.level.block.entity.TestInstanceBlockEntity.Status.CLEARED);
    }

    @Inject(at = @At("HEAD"), method = "byIndex(I)Lnet/minecraft/world/level/block/entity/TestInstanceBlockEntity$Status;", cancellable = true)
    private static void byIndex_821623646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(821623646L))
            info.setReturnValue(net.minecraft.world.level.block.entity.TestInstanceBlockEntity.Status.RUNNING);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_377114093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(377114093L))
            info.setReturnValue("kA\u8CEB%\u803Ahj\uC3C0 &A\uB20DJ\uABE5xhZ3bM@\u7496PE?zLO\u1966F>4/,^eV");
    }


}
