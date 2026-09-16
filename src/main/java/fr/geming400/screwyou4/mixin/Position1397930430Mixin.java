package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.repository.Pack.Position.class)
public class Position1397930430Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/server/packs/repository/Pack$Position;", cancellable = true)
    private static void values_121420583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(121420583L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "insert(Ljava/util/List;Ljava/lang/Object;Ljava/util/function/Function;Z)I", cancellable = true)
    private void insert_1546158042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1546158042L))
            info.setReturnValue(83839235);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/server/packs/repository/Pack$Position;", cancellable = true)
    private static void valueOf_1452938752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1452938752L))
            info.setReturnValue(net.minecraft.server.packs.repository.Pack.Position.BOTTOM);
    }

    @Inject(at = @At("HEAD"), method = "opposite()Lnet/minecraft/server/packs/repository/Pack$Position;", cancellable = true)
    private void opposite__1354253025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1354253025L))
            info.setReturnValue(net.minecraft.server.packs.repository.Pack.Position.TOP);
    }


}
