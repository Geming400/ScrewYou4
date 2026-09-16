package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ServerPlayer.RespawnConfig.class)
public class RespawnConfig_1145013766Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_236387497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(236387497L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1915437290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1915437290L))
            info.setReturnValue("tYw2LP?\u34AFEy01gJ\u9499l\u3D81.\"\u2512R$\u3A4D\uACB6xl3UpGsAM\u9CD7\uFFEEJ>>BMA\u8FB4m%-CA5E C1^Pm/");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1702365856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1702365856L))
            info.setReturnValue(-138834963);
    }

    @Inject(at = @At("HEAD"), method = "respawnData()Lnet/minecraft/world/level/storage/LevelData$RespawnData;", cancellable = true)
    private void respawnData_106617163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(106617163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSamePosition(Lnet/minecraft/server/level/ServerPlayer$RespawnConfig;)Z", cancellable = true)
    private void isSamePosition_1013021375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1013021375L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "forced()Z", cancellable = true)
    private void forced_1099344003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1099344003L))
            info.setReturnValue(true);
    }


}
