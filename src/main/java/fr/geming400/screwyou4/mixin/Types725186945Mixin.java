package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SkullBlock.Types.class)
public class Types725186945Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/SkullBlock$Types;", cancellable = true)
    private static void values__104940933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-104940933L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/SkullBlock$Types;", cancellable = true)
    private static void valueOf__1691486654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1691486654L))
            info.setReturnValue(net.minecraft.world.level.block.SkullBlock.Types.PIGLIN);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_813395567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(813395567L))
            info.setReturnValue("c}L\u29FD{(-\uB9FD\u1CABQw'\u205DuD.{lI#\uAC51'o[Z\u3986:lj9A1\u60DFNK6,{tylnG}\u8704{$PTq$R_t)\uB5E6H\u6DD1:&(");
    }


}
