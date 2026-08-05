package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.enderdragon.phases.EnderDragonPhase.class)
public class EnderDragonPhase143388240Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__992072231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-992072231L))
            info.setReturnValue("K5{!P/䛘밇ᣳNdVX-0v'j셄G5+鯚{[k⩈@.#2&TAB눓{(e1㾃囕)D$2");
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_181650486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(181650486L))
            info.setReturnValue(2138108371);
    }

    @Inject(at = @At("HEAD"), method = "getCount()I", cancellable = true)
    private static void getCount_181650734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(181650734L))
            info.setReturnValue(-2067597180);
    }

    @Inject(at = @At("HEAD"), method = "createInstance(Lnet/minecraft/world/entity/boss/enderdragon/EnderDragon;)Lnet/minecraft/world/entity/boss/enderdragon/phases/DragonPhaseInstance;", cancellable = true)
    private void createInstance_570210054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(570210054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getById(I)Lnet/minecraft/world/entity/boss/enderdragon/phases/EnderDragonPhase;", cancellable = true)
    private static void getById__2127812439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2127812439L))
            info.setReturnValue(null);
    }


}
