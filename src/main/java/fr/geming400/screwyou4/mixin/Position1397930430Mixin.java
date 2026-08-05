package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.repository.Pack.Position.class)
public class Position1397930430Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/server/packs/repository/Pack$Position;", cancellable = true)
    private static void values__639619963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-639619963L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "insert(Ljava/util/List;Ljava/lang/Object;Ljava/util/function/Function;Z)I", cancellable = true)
    private void insert_205139699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(205139699L))
            info.setReturnValue(-176424991);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/server/packs/repository/Pack$Position;", cancellable = true)
    private static void valueOf_1744888360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1744888360L))
            info.setReturnValue(net.minecraft.server.packs.repository.Pack.Position.BOTTOM);
    }

    @Inject(at = @At("HEAD"), method = "opposite()Lnet/minecraft/server/packs/repository/Pack$Position;", cancellable = true)
    private void opposite_1923372582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1923372582L))
            info.setReturnValue(net.minecraft.server.packs.repository.Pack.Position.TOP);
    }


}
