package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.WorldLoader.InitConfig.class)
public class InitConfig1995672941Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1087046673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1087046673L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1528870830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1528870830L))
            info.setReturnValue("!_;e19\uCE17=lQPs=\uBC1Ex\u0B4BQ sZ0\uBC42=oz)tU\uA719\u0426g)HO)>.2iV^@>6");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1741942264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1741942264L))
            info.setReturnValue(1034348242);
    }

    @Inject(at = @At("HEAD"), method = "functionCompilationPermissions()Lnet/minecraft/server/permissions/PermissionSet;", cancellable = true)
    private void functionCompilationPermissions_108364260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(108364260L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "commandSelection()Lnet/minecraft/commands/Commands$CommandSelection;", cancellable = true)
    private void commandSelection__1154550158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1154550158L))
            info.setReturnValue(net.minecraft.commands.Commands.CommandSelection.DEDICATED);
    }

    @Inject(at = @At("HEAD"), method = "packConfig()Lnet/minecraft/server/WorldLoader$PackConfig;", cancellable = true)
    private void packConfig__650567356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-650567356L))
            info.setReturnValue(null);
    }


}
