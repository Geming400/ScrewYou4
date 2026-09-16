package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.WorldLoader.PackConfig.class)
public class PackConfig756117878Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__152508390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-152508390L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1526541403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1526541403L))
            info.setReturnValue("R`/zO*");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1313469969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1313469969L))
            info.setReturnValue(-223669649);
    }

    @Inject(at = @At("HEAD"), method = "initMode()Z", cancellable = true)
    private void initMode_234965050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(234965050L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "initialDataConfig()Lnet/minecraft/world/level/WorldDataConfiguration;", cancellable = true)
    private void initialDataConfig_795395358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(795395358L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "packRepository()Lnet/minecraft/server/packs/repository/PackRepository;", cancellable = true)
    private void packRepository_13822156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(13822156L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createResourceManager()Lcom/mojang/datafixers/util/Pair;", cancellable = true)
    private void createResourceManager_397314517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(397314517L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "safeMode()Z", cancellable = true)
    private void safeMode__333551011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-333551011L))
            info.setReturnValue(true);
    }


}
