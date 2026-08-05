package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.TestInstanceBlockEntity.Status.class)
public class Status_1512574565Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/entity/TestInstanceBlockEntity$Status;", cancellable = true)
    private static void values__1683278482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1683278482L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/entity/TestInstanceBlockEntity$Status;", cancellable = true)
    private static void valueOf__376247289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-376247289L))
            info.setReturnValue(net.minecraft.world.level.block.entity.TestInstanceBlockEntity.Status.CLEARED);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1600783186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1600783186L))
            info.setReturnValue("&`)gcY\u30DB_+nS$91(A\u8ED6H\u9BA03TXs2sk*%GoB,o-Ntoj:^%yK/rN_");
    }

    @Inject(at = @At("HEAD"), method = "byIndex(I)Lnet/minecraft/world/level/block/entity/TestInstanceBlockEntity$Status;", cancellable = true)
    private static void byIndex__877285991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-877285991L))
            info.setReturnValue(net.minecraft.world.level.block.entity.TestInstanceBlockEntity.Status.FINISHED);
    }


}
