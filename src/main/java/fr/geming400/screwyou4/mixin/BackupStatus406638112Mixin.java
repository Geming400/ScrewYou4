package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.LevelSummary.BackupStatus.class)
public class BackupStatus406638112Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/storage/LevelSummary$BackupStatus;", cancellable = true)
    private static void values_1692628351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1692628351L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/storage/LevelSummary$BackupStatus;", cancellable = true)
    private static void valueOf__1001855144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1001855144L))
            info.setReturnValue(net.minecraft.world.level.storage.LevelSummary.BackupStatus.DOWNGRADE);
    }

    @Inject(at = @At("HEAD"), method = "shouldBackup()Z", cancellable = true)
    private void shouldBackup_1811401634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1811401634L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getTranslationKey()Ljava/lang/String;", cancellable = true)
    private void getTranslationKey__879672947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-879672947L))
            info.setReturnValue("v\u0881[83fFZMuk04pD.xn\u23088\u0A71x(\uAC10+ip\uB25C^EKQM1#E!x \u9F18+>\uC913q:q,_z\u4336heKbfWa[\u8A449p5\uCB710N=-Ag8W4^J\u33A9e\uA9EB\u1B03d4xR\u3D8Dq0Pz>C\uF9D8;x!Co");
    }

    @Inject(at = @At("HEAD"), method = "isSevere()Z", cancellable = true)
    private void isSevere__1737415079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1737415079L))
            info.setReturnValue(true);
    }


}
