package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.LevelSummary.BackupStatus.class)
public class BackupStatus406638112Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/storage/LevelSummary$BackupStatus;", cancellable = true)
    private static void values__1968789283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1968789283L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/storage/LevelSummary$BackupStatus;", cancellable = true)
    private static void valueOf__1026225280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1026225280L))
            info.setReturnValue(net.minecraft.world.level.storage.LevelSummary.BackupStatus.UPGRADE_TO_SNAPSHOT);
    }

    @Inject(at = @At("HEAD"), method = "shouldBackup()Z", cancellable = true)
    private void shouldBackup_444916695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(444916695L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getTranslationKey()Ljava/lang/String;", cancellable = true)
    private void getTranslationKey__728822359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-728822359L))
            info.setReturnValue("+ᨀLe:ꃢY'䰓@[,.P䜅⋁¬翧갽謍.f/RZ(T紲cH삠h陊%+n<]c耓#Y[w䒃g p觱y⭣澉WH\"FN7pMy-&");
    }

    @Inject(at = @At("HEAD"), method = "isSevere()Z", cancellable = true)
    private void isSevere_444916695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(444916695L))
            info.setReturnValue(true);
    }


}
