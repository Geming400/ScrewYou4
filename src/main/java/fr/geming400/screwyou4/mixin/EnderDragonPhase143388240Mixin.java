package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.enderdragon.phases.EnderDragonPhase.class)
public class EnderDragonPhase143388240Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_913811269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(913811269L))
            info.setReturnValue("\u8870.?m111&YOt\u0974<|9\u372Eu3'k|Be.*3:\u82D8G[:82\u0DD8p@a<\uD6A7i7.X)[z\uCC6FX=)<./Jld;Xo&\uBC96v0s$'\uF96ABe\u92F5!");
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId__1514935355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1514935355L))
            info.setReturnValue(-1526446507);
    }

    @Inject(at = @At("HEAD"), method = "getCount()I", cancellable = true)
    private static void getCount__1242530443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1242530443L))
            info.setReturnValue(-1124652451);
    }

    @Inject(at = @At("HEAD"), method = "createInstance(Lnet/minecraft/world/entity/boss/enderdragon/EnderDragon;)Lnet/minecraft/world/entity/boss/enderdragon/phases/DragonPhaseInstance;", cancellable = true)
    private void createInstance_1100402677(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1100402677L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getById(I)Lnet/minecraft/world/entity/boss/enderdragon/phases/EnderDragonPhase;", cancellable = true)
    private static void getById_2116088561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2116088561L))
            info.setReturnValue(null);
    }


}
