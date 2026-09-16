package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.schemas.V1458.class)
public class V14581256765550Mixin {
        @Inject(at = @At("HEAD"), method = "nameable(Lcom/mojang/datafixers/schemas/Schema;)Lcom/mojang/datafixers/types/templates/TypeTemplate;", cancellable = true)
    private static void nameable__2017734680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2017734680L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerBlockEntities(Lcom/mojang/datafixers/schemas/Schema;)Ljava/util/Map;", cancellable = true)
    private void registerBlockEntities__1568015497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1568015497L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerTypes(Lcom/mojang/datafixers/schemas/Schema;Ljava/util/Map;Ljava/util/Map;)V", cancellable = true)
    private void registerTypes_1218545207(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1218545207L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "nameableInventory(Lcom/mojang/datafixers/schemas/Schema;)Lcom/mojang/datafixers/types/templates/TypeTemplate;", cancellable = true)
    private static void nameableInventory__144946566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-144946566L))
            info.setReturnValue(null);
    }


}
